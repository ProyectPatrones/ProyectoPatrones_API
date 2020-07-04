package com.ehealt.ts.models;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    private Integer id;

    private String username;

    @Column(name = "name", length = 50)
    private String name;

    private String lastName;

    private String diagnostico;
    private String password;

    public User(String name, String password, List<GrantedAuthority> roles) {
        this.name=name;
        this.password = password;
    }


 //   public static int contador=0;
  //  public static User instance;
  //  private User(){
  //      contador++;
   // }

 // public static synchronized User getInstance(){
  //      if(instance==null){
 //           instance= new User();
 //       }
 //       return instance;
  //}

}
