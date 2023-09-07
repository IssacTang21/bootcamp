package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor
// @NoArgsConstructor
// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode
// @Builder
@Data // getter, setter, tostring , equals, hashcode, requiredargsconstructor
@AllArgsConstructor
@Builder
public class Book {
  private String author;
  private double weight;


}
