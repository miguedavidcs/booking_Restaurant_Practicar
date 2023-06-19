package com.boot.bookingrestaurantapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.TimeZone;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class BookingRestaurantApiApplication 
{
    public static void main( String[] args )
    {	SpringApplication.run(BookingRestaurantApiApplication.class, args);
        System.out.println( "Hello World!" );
        System.out.println(TimeZone.getDefault().getID());
    }
}
