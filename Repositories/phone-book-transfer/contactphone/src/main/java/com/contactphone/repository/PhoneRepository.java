/**
 * 
 */
package com.contactphone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactphone.entity.Phone;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long>
{


}
