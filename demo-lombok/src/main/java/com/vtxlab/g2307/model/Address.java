package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@RequiredArgsConstructor
// @Builder
@SuperBuilder
@ToString(callSuper = true)
public class Address extends Human {
  private String addrLine1;
  private String addrLine2;
  private String addrLine3;
  @NonNull
  private Country country;

  // public Address(Country country){
  // if(country == null)
  // throw new NullPointerException();
  // this.country = country;
  // }

  public Address(String addrLine1, String addrLine2, String addrLine3, Country country, String name) {
    super(name);
    this.addrLine1 = addrLine1;
    this.addrLine2 = addrLine2;
    this.addrLine3 = addrLine3;
  }

  public static void main(String[] args) {
    Address a1 = new Address(Country.HK);
    // Address a3 = new Address(null);
    Address a2 = Address.builder()
        .addrLine1("")
        .addrLine2("")
        .addrLine3("")
        .name("Ben")
        .country(Country.US)
        .build();
    System.out.println(a2);
  }
}
