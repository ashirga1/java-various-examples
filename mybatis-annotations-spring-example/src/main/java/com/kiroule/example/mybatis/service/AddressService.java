package com.kiroule.example.mybatis.service;

import com.kiroule.example.mybatis.domain.Address;
import com.kiroule.example.mybatis.mapper.AddressMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Igor Baiborodine
 */
public class AddressService {

  private static final Logger logger = LoggerFactory.getLogger(AddressService.class);
  private AddressMapper addressMapper;

  @Autowired
  public void setAddressMapper(@Nonnull AddressMapper addressMapper) {
    checkNotNull(addressMapper, "Argument[addressMapper] must not be null");
    this.addressMapper = addressMapper;
  }

  @Nonnull
  public Short addAddress(@Nonnull Address address) {
    checkNotNull(address, "Argument[address] must not be null");
    addressMapper.insert(address);
    logger.info("Added address[{}]", address);
    return address.getAddressId();
  }
}
