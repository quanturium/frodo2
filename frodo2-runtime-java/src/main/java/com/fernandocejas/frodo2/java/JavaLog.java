package com.fernandocejas.frodo2.java;

import com.fernandocejas.frodo2.logging.Logger;

public class JavaLog implements Logger {

  public JavaLog() {}

  @Override
  public void log(String tag, String message) {
    //TODO: implement proper logging
    System.out.println(message);
  }
}