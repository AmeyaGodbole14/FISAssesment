package com.fis.airline.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.airline.Entity.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer>  {

}
