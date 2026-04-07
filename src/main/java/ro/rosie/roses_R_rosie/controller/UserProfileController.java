package ro.rosie.roses_R_rosie.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.rosie.roses_R_rosie.dto.UserProfileDTO;
import ro.rosie.roses_R_rosie.service.UserProfileService;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserProfileController {

    private final UserProfileService userProfileService;

    @PatchMapping("/profile")
    public ResponseEntity<UserProfileDTO> updateProfile(@Valid @RequestBody UserProfileDTO userDto) {
        UserProfileDTO updatedProfile = userProfileService.changeUserProfileInfo(userDto);
        return ResponseEntity.ok(updatedProfile);
    }
}
