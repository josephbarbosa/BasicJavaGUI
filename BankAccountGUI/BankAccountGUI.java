/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment3agui;

/**
 *
 * @author josephbarbosa
 */
public class BankAccountGUI {
    //DATA MEMBERS
    private String userFullName, userAddress, userCity, userState;
    private double userMonths, userPrincipal, userAnnualRate, userBonus, userInterest, userTotal;
    
    //Default Constructor
    public BankAccountGUI()
    {
        userFullName = "";
        userAddress = "";
        userCity = "";
        userState = "";
        userMonths = 0.0;
        userPrincipal = 0.0;
        userAnnualRate = 0.0;
        userBonus = 0.0;
        userInterest = 0.0;
        userTotal = 0.0;
    }
    
    public String getFullName()
    {
        return userFullName;
    }
    public String getUserAddress()
    {
        return userAddress;
    }
    public String getUserCity()
    {
        return userCity;
    }
    public String getUserState()
    {
        return userState;
    }
    public double getUserMonths()
    {
        return userMonths;
    }
    public double getUserPrincipal()
    {
        return userPrincipal;
    }
    public double getUserAnnualRate()
    {
        return userAnnualRate;
    }
    public double getUserBonus()
    {
        return userBonus;
    }
    public double getUserInterest()
    {
        return userInterest;
    }
    public double getUserTotal()
    {
        return userTotal;
    }
    public void setUserFullName(String fullName)
    {
        this.userFullName = fullName;
    }
    public void setUserAddress(String address)
    {
        this.userAddress = address;
    }
    public void setUserCity(String city)
    {
        this.userCity = city;
    }
    public void setUserState(String state)
    {
        this.userState = state;
    }
    public void setUserMonths(double months)
    {
        if (months < 0) //VALIDATION
        {
          this.userMonths = 0;
        }   
        else 
        {
            this.userMonths = months;
        }
    }
    public void setUserPrincipal(double principal)
    {
        if (principal < 0) //VALIDATION
        {
          this.userPrincipal = 0;
        }   
        else 
        {
          this.userPrincipal = principal;
        }
    }
    public void setUserAnnualRate(double rate)
    {
        if (rate < 0) //VALIDATION
        {
          this.userAnnualRate = 0;
        }   
        else 
        {
            this.userAnnualRate = rate;
        }
    }
    public void calculateUserInterest()
    {
        double years = userMonths / 12.0;
        userAnnualRate = userAnnualRate/100.0;
        double totalWithInterest = userPrincipal * Math.pow(1.0 + (userAnnualRate/12.0), (12.0*years));
        
        userInterest = totalWithInterest - userPrincipal;
    }
    public void calculateUserBonus()
    {
        int years = (int)userMonths / 12;
        double bonusPercent = years * 0.02;
        
        this.userBonus = userPrincipal * bonusPercent;
    }
    public void calculateUserTotal()
    {
        this.userTotal = userPrincipal + userBonus + userInterest;
    }
}
