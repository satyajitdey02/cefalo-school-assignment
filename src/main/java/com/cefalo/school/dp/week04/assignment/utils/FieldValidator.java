package com.cefalo.school.dp.week04.assignment.utils;

import org.apache.commons.lang.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by satyajit on 10/24/16.
 */
public class FieldValidator {
  private static final String NAME_REGEX = "^[\\p{L} .'-]+$";
  private static final String PHONE_REGEX = "^\\+(?:[0-9] ?){6,14}[0-9]$";
  private static final String EMAIL_REGEX = "^[_A-Za-z0-9]+([_A-Za-z0-9]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,6})$";
  private static final String DATE_REGEX = "^\\d{1,2}/\\d{1,2}/\\d{4}$";
  private static final String ZIP_CODE_REGEX = "^(0[1-9]|[1-4][0-9]|5[0-2])[0-9]{3}$";

  public static boolean validateName(String name) {
    return StringUtils.isNotBlank(name) &&
        checkRegEx(Pattern.compile(NAME_REGEX), name);
  }

  public static boolean validatePhone(String phone) {
    return StringUtils.isNotBlank(phone) &&
        checkRegEx(Pattern.compile(PHONE_REGEX), phone);
  }

  public static boolean validateEmail(String email) {
    return StringUtils.isNotBlank(email) &&
        checkRegEx(Pattern.compile(EMAIL_REGEX), email);
  }

  public static boolean validateDate(String date) {
    return StringUtils.isNotBlank(date) &&
        checkRegEx(Pattern.compile(DATE_REGEX), date);
  }

  public static boolean validateZipCode(String zipCode) {
    return StringUtils.isNotBlank(zipCode) &&
        checkRegEx(Pattern.compile(ZIP_CODE_REGEX), zipCode);
  }

  public static boolean validatePassword(String password) {
    return StringUtils.isNotBlank(password) && password.length() > 6;
  }

  private static boolean checkRegEx(Pattern p, String str) {
    Matcher matcher = p.matcher(str);
    return matcher.matches();
  }

}
