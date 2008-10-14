/**
 * Copyright (c) 2008 Red Hat, Inc.
 *
 * This software is licensed to you under the GNU General Public License,
 * version 2 (GPLv2). There is NO WARRANTY for this software, express or
 * implied, including the implied warranties of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. You should have received a copy of GPLv2
 * along with this software; if not, see
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.txt.
 * 
 * Red Hat trademarks are not licensed under GPLv2. No permission is
 * granted to use or replicate Red Hat trademarks that are incorporated
 * in this software or its documentation. 
 */
package com.redhat.rhn.frontend.dto;


/**
 * SystemSearchResult
 * @version $Rev$
 */
public class SystemSearchResult extends SystemOverview {
    
    private String matchingField;
    private String hostname;
    private String description;
    private Long cpuNumberOfCpus;
    private String cpuMhz;
    private String cpuModel;
    private String dmiSystem;
    private String dmiBiosVendor;
    private String dmiAsset;
    private String ipaddr;
    private String machine;
    private String rack;
    private String room;
    private String building;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private Long ram;
    
    /**
     * @return returns the data in the field 
     * that was searched on
     */
    public String getMatchingField() {
        return matchingField;
    }

    /**
     * @param matchingFieldIn The matchingField to set.
     */
    public void setMatchingField(String matchingFieldIn) {
        this.matchingField = matchingFieldIn;
    }
    
    /**
     * Takes care of cases where the DB will be returning numerical
     * instead of varchar vlues
     * @param matchingFieldIn matchingField to set
     */
    public void setMatchingField(Long matchingFieldIn) {
        this.matchingField = matchingFieldIn.toString();
    }

    /**
     * @return the hostname
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * @param hostnameIn the hostname to set
     */
    public void setHostname(String hostnameIn) {
        this.hostname = hostnameIn;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param descriptionIn the description to set
     */
    public void setDescription(String descriptionIn) {
        this.description = descriptionIn;
    }
    
    
    /**
     * @return the cpuNumberOfCpus
     */
    public Long getCpuNumberOfCpus() {
        return cpuNumberOfCpus;
    }

    /**
     * @param cpuNumberOfCpusIn the cpuNumberOfCpus to set
     */
    public void setCpuNumberOfCpus(Long cpuNumberOfCpusIn) {
        this.cpuNumberOfCpus = cpuNumberOfCpusIn;
    }

    /**
     * @return the cpuMhz
     */
    public String getCpuMhz() {
        return cpuMhz;
    }

    /**
     * @param cpuMhzIn the cpuMhz to set
     */
    public void setCpuMhz(String cpuMhzIn) {
        this.cpuMhz = cpuMhzIn;
    }

    /**
     * @return the cpuModel
     */
    public String getCpuModel() {
        return cpuModel;
    }

    /**
     * @param cpuModelIn the cpuModel to set
     */
    public void setCpuModel(String cpuModelIn) {
        this.cpuModel = cpuModelIn;
    }

    /**
     * @return the dmiSystem
     */
    public String getDmiSystem() {
        return dmiSystem;
    }

    /**
     * @param dmiSystemIn the dmiSystem to set
     */
    public void setDmiSystem(String dmiSystemIn) {
        this.dmiSystem = dmiSystemIn;
    }

    /**
     * @return the dmiBiosVendor
     */
    public String getDmiBiosVendor() {
        return dmiBiosVendor;
    }

    /**
     * @param dmiBiosVendorIn the dmiBiosVendor to set
     */
    public void setDmiBiosVendor(String dmiBiosVendorIn) {
        this.dmiBiosVendor = dmiBiosVendorIn;
    }

    /**
     * @return the dmiAsset
     */
    public String getDmiAsset() {
        return dmiAsset;
    }

    /**
     * @param dmiAssetIn the dmiAsset to set
     */
    public void setDmiAsset(String dmiAssetIn) {
        this.dmiAsset = dmiAssetIn;
    }

    /**
     * @return the ipaddr
     */
    public String getIpaddr() {
        return ipaddr;
    }

    /**
     * @param ipaddrIn the ipaddr to set
     */
    public void setIpaddr(String ipaddrIn) {
        this.ipaddr = ipaddrIn;
    }

    /**
     * @return the machine
     */
    public String getMachine() {
        return machine;
    }

    /**
     * @param machineIn the machine to set
     */
    public void setMachine(String machineIn) {
        this.machine = machineIn;
    }

    /**
     * @return the rack
     */
    public String getRack() {
        return rack;
    }

    /**
     * @param rackIn the rack to set
     */
    public void setRack(String rackIn) {
        this.rack = rackIn;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param roomIn the room to set
     */
    public void setRoom(String roomIn) {
        this.room = roomIn;
    }

    /**
     * @return the building
     */
    public String getBuilding() {
        return building;
    }

    /**
     * @param buildingIn the building to set
     */
    public void setBuilding(String buildingIn) {
        this.building = buildingIn;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1In the address1 to set
     */
    public void setAddress1(String address1In) {
        this.address1 = address1In;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2In the address2 to set
     */
    public void setAddress2(String address2In) {
        this.address2 = address2In;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param cityIn the city to set
     */
    public void setCity(String cityIn) {
        this.city = cityIn;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param stateIn the state to set
     */
    public void setState(String stateIn) {
        this.state = stateIn;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param countryIn the country to set
     */
    public void setCountry(String countryIn) {
        this.country = countryIn;
    }

    /**
     * @return the ram
     */
    public Long getRam() {
        return ram;
    }

    /**
     * @param ramIn the ram to set
     */
    public void setRam(Long ramIn) {
        this.ram = ramIn;
    }
}
