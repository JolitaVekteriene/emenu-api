package lt.codeacademy.emenuapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.codeacademy.emenuapi.entity.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {
    private UUID id;
    @NotBlank
    private String name;
    private String surname;
    private String username;
    private String email;
    private String country;
    private String city;
    private String street;
    private String postCode;
    private Set<Role> roles;
    private String phone;
    @NotBlank
    private String password;
    @NotBlank
    private String repeatPassword;

    public User(UUID id, String name, String surname, String username, String email, String country, String city, String street, String postCode, String phone, Set<Role> roles, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.country = country;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.phone = phone;
        this.roles = roles;
        this.password = password;
    }

    public static User convert(UserEntity entity) {
        Set<Role> roles = entity.getRoles().stream()
                .map(Role::convert)
                .collect(Collectors.toSet());

        return new User(entity.getId(),
                entity.getName(),
                entity.getSurname(),
                entity.getUsername(),
                entity.getEmail(),
                entity.getCountry(),
                entity.getCity(),
                entity.getStreet(),
                entity.getPostCode(),
                entity.getPhone(),
                roles,
                entity.getPassword());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}
