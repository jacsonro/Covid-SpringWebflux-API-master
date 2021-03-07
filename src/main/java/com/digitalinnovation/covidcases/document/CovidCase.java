package com.digitalinnovation.covidcases.document;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import com.digitalinnovation.covidcases.enums.*;
import org.springframework.data.annotation.Id;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data

@NoArgsConstructor
@DynamoDBTable(tableName ="Covid_Cases_Api_Table")


public class CovidCase {
  @Id
  @DynamoDBHashKey (attributeName = "id")
  private String id;

  @DynamoDBAttribute (attributeName = "age")
  private int age;

  @DynamoDBAttribute (attributeName = "numberOfFamilyMembers")
  private int numberOfFamilyMembers;

  @DynamoDBAttribute (attributeName = "socialIsolation")
  private boolean socialIsolation;

  @DynamoDBAttribute (attributeName = "physicalExercise")
  private boolean physicalExercise;

  @DynamoDBAttribute (attributeName = "wearMask")
  private boolean wearMask;

  @DynamoDBAttribute (attributeName = "homework")
  private boolean homework;

  @DynamoDBTypeConvertedEnum
  @DynamoDBAttribute (attributeName = "marital")
  private MaritalStatus maritalStatus;

  @DynamoDBTypeConvertedEnum
  @DynamoDBAttribute (attributeName = "race")
  private Race race;

  @DynamoDBTypeConvertedEnum
  @DynamoDBAttribute (attributeName = "sex")
  private Sex sex;

  @DynamoDBTypeConvertedEnum
  @DynamoDBAttribute (attributeName = "meansOfTransportation")
  private MeansOfTransportation meansOfTransportation;

  @DynamoDBTypeConvertedEnum
  @DynamoDBAttribute (attributeName = "symptoms")
  private Symptoms symptoms;

  @DynamoDBTypeConvertedEnum
  @DynamoDBAttribute (attributeName = "country")
  private Country country;

  @DynamoDBTypeConvertedEnum
  @DynamoDBAttribute (attributeName = "states")
  private BrazilStates states;

  @DynamoDBAttribute (attributeName = "district")
  private String district;

}

