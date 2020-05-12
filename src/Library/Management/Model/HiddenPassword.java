/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.Model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 *
 * @author mahame
 */
public class HiddenPassword {
    
    public String encodePassword(String password){
          Base64.Encoder en= Base64.getEncoder();
        return en.encodeToString(password.getBytes(StandardCharsets.UTF_8));
        
    }
    public String decodePassword(String password){
        
        Base64.Decoder deco=Base64.getDecoder();
        return new String(deco.decode(password));
    }
    
}
