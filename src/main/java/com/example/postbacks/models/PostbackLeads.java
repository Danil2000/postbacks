package com.example.postbacks.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class PostbackLeads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private String campaign_id;
    private String status;
    private String offer_id;
    private Float payout;
    private String country_code;
    private String currency;
    private String partner;

    public PostbackLeads(){}
}
