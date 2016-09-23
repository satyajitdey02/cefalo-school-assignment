package com.cefalo.school.dp.week01.assignment.sort;

import com.cefalo.school.dp.week01.assignment.io.Input;
import com.cefalo.school.dp.week01.assignment.io.Output;

/**
 * Created by satyajit on 9/22/2016.
 */
public abstract class DQAlgorithm {
  final public Output sort(Input p) {
    Input[] pp;
    if (isBaseCase(p)) {
      return conquer(p);
    } else {
      pp = divide(p);
    }

    Output[] ss = new Output[pp.length];
    for (int i = 0; i < pp.length; i++) {
      ss[i] = sort(pp[i]);
    }

    return combine(p, ss);
  }

  protected abstract boolean isBaseCase(Input p);

  protected abstract Output conquer(Input p);

  protected abstract  Input[] divide(Input p);

  protected abstract Output combine(Input p, Output[] ss);

}
