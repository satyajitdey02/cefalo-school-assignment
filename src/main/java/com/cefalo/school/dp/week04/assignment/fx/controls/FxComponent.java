package com.cefalo.school.dp.week04.assignment.fx.controls;

import com.cefalo.school.dp.week04.assignment.validators.ValidationResponse;

/**
 * Created by satyajit on 10/2/16.
 */
public interface FxComponent {
  void add(FxComponent component);
  void remove(FxComponent component);
  void getChild(int index);
  ValidationResponse validate();
}
