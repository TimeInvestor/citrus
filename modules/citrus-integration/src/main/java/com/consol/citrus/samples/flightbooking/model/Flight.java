/*
 * Copyright 2006-2010 ConSol* Software GmbH.
 * 
 * This file is part of Citrus.
 * 
 *  Citrus is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Citrus is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Citrus.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.consol.citrus.samples.flightbooking.model;

import javax.persistence.*;

@Entity
@Table(name = "FBS_FLIGHT")
public class Flight {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "FLIGHT_ID")
    private String flightId;
    
    @Column(name = "AIRLINE", length = 150, nullable = false)
    private String airline;
    
    @Column(name = "FROM_AIRPORT", length = 3, nullable = false)
    private String fromAirport;
    
    @Column(name = "TO_AIRPORT", length = 3, nullable = false)
    private String toAirport;
    
    @Column(name = "DATE", length = 20, nullable = false)
    private String date;
    
    @Column(name = "SCHEDULED_DEPARTURE", length = 40, nullable = false)
    private String scheduledDeparture;
    
    @Column(name = "SCHEDULED_ARRIVAL", length = 40, nullable = false)
    private String scheduledArrival;
    
    /**
     * @return the flightId
     */
    public String getFlightId() {
        return flightId;
    }
    /**
     * @param flightId the flightId to set
     */
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }
    /**
     * @return the airline
     */
    public String getAirline() {
        return airline;
    }
    /**
     * @param airline the airline to set
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }
    /**
     * @return the from
     */
    public String getFromAirport() {
        return fromAirport;
    }
    /**
     * @param from the from to set
     */
    public void setFromAirport(String from) {
        this.fromAirport = from;
    }
    /**
     * @return the to
     */
    public String getToAirport() {
        return toAirport;
    }
    /**
     * @param to the to to set
     */
    public void setToAirport(String to) {
        this.toAirport = to;
    }
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }
    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * @return the scheduledDeparture
     */
    public String getScheduledDeparture() {
        return scheduledDeparture;
    }
    /**
     * @param scheduledDeparture the scheduledDeparture to set
     */
    public void setScheduledDeparture(String scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }
    /**
     * @return the scheduledArrival
     */
    public String getScheduledArrival() {
        return scheduledArrival;
    }
    /**
     * @param scheduledArrival the scheduledArrival to set
     */
    public void setScheduledArrival(String scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }
}
