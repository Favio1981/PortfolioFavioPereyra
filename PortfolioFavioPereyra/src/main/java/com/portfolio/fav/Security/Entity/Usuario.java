/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fav.Security.Entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author JLucian
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    @NotNull
    private String Nombre;
    @NotNull
    @Column(unique = true)
    private String nomnbreUsuario;
     @NotNull
    private String email;
      @NotNull
    private String password;
      @ManyToMany(fetch = FetchType.EAGER)
      @JoinTable(name = "usuario_rol", joinColumns=@JoinColumn(name="usuario_id"), inverseJoinColumns=@JoinColumn(name="rol_id"))
    private Set<Rol> roles = new HashSet<>();
      //constructor

    public Usuario() {
        
    }

    public Usuario(String Nombre, String nomnbreUsuario, String email, String password) {
        this.Nombre = Nombre;
        this.nomnbreUsuario = nomnbreUsuario;
        this.email = email;
        this.password = password;
    }
    
    //getter y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNomnbreUsuario() {
        return nomnbreUsuario;
    }

    public void setNomnbreUsuario(String nomnbreUsuario) {
        this.nomnbreUsuario = nomnbreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
    
    
      
      
}
