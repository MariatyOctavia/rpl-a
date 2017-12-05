/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author user
 */
public class md5 {
    public static String md5s (String password) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }
}
