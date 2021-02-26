package top.wanzc.spring.boot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import top.wanzc.spring.boot.jpa.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}