package se.robasto.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import se.robasto.model.UserModel;

@Component
public class JwtGenerator {


    public String generate(UserModel userModel) {


        Claims claims = Jwts.claims().setSubject(userModel.getUsername());
        claims.put("userId", String.valueOf(userModel.getId()));
        claims.put("role", userModel.getRole());

        return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, "volvo").compact();
    }
}
