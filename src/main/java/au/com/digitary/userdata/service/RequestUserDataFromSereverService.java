package au.com.digitary.userdata.service;

import au.com.digitary.userdata.dto.UserDataDTO;
import java.io.IOException;

/**
 * Interface for dealing with third party server communications.
 * 
 * @author theja
 */
public interface RequestUserDataFromSereverService {
    
    public UserDataDTO requestUserData(String userName) throws IOException;
}
