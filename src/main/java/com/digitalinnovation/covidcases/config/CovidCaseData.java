package com.digitalinnovation.covidcases.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import static com.digitalinnovation.covidcases.constants.CovidCaseConstant.ENDPOINT_DYNAMO;
import static com.digitalinnovation.covidcases.constants.CovidCaseConstant.REGION_DYNAMO;

public class CovidCaseData {
  public static void main(String[] args) throws Exception {

    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
      .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
      .build();
    DynamoDB dynamoDB = new DynamoDB(client);

    Table table = dynamoDB.getTable("Covid_Cases_Api_Table");

    Item covidCase = new Item()
            .withPrimaryKey("id", "1")
            .withNumber("numberOfFamilyMembers", 4)
            .withNumber("age", 22)
            .withBoolean("socialIsolation", true)
            .withBoolean("physicalExercise", true)
            .withBoolean("wearMask", true)
            .withBoolean("homework", false)
            .withBoolean("comorbidity", false)
            .withString("marital", "CASADO")
            .withString("race", "NEGRA")
            .withString("sex", "MASC")
            .withString("symptoms", "CANSADO")
            .withString("meansOfTransportation", "PUBLICO")
            .withString("country", "BR")
            .withString("states", "GO")
            .withString("district", "Setor Primavera");

    Item covidCase2 = new Item()
            .withPrimaryKey("id", "2")
            .withNumber("numberOfFamilyMembers", 4)
            .withNumber("age", 42)
            .withBoolean("socialIsolation", true)
            .withBoolean("physicalExercise", true)
            .withBoolean("wearMask", true)
            .withBoolean("homework", false)
            .withBoolean("comorbidity", true)
            .withString("marital", "CASADO")
            .withString("race", "NEGRA")
            .withString("sex", "MASC")
            .withString("symptoms", "DOR_PEITO")
            .withString("meansOfTransportation", "PUBLICO")
            .withString("country", "BR")
            .withString("states", "GO")
            .withString("district", "Setor Bueno");

    PutItemOutcome outcome1 = table.putItem(covidCase);
    PutItemOutcome outcome2 = table.putItem(covidCase2);

  }

}

