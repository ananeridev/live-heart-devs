package com.bootcamp.microservicemeetup.service;

import com.bootcamp.microservicemeetup.model.entity.Meetup;
import org.springframework.stereotype.Service;


public interface MeetupService {

    Meetup save(Meetup meetup);

}
