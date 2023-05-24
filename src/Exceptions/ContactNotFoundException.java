package Exceptions;

import java.util.Date;

public class ContactNotFoundException extends Exception {
    private Date timeOfException;

    public ContactNotFoundException(String message)
    {
        super(message);
        timeOfException = new Date();
    }

    public Date getTimeOfException()
    {
        return timeOfException;

    }

    @Override
    public String getMessage()
    {
        return super.getMessage() + " Exception thrown at : (" + getTimeOfException()+ ").";
    }


}
