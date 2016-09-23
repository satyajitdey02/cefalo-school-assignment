package com.cefalo.school.dp.week01.assignment.sort;

import com.cefalo.school.dp.week01.assignment.io.Input;
import com.cefalo.school.dp.week01.assignment.io.Output;

/**
 * Created by satyajit on 9/22/2016.
 */
public abstract class DQAlgorithm {
  final public Output solve(Input input) {
    Input[] inputs;
    if (isBaseCase(input)) {
      return conquer(input);
    } else {
      inputs = divide(input);
    }

    Output[] outputs = new Output[inputs.length];
    for (int i = 0; i < inputs.length; i++) {
      outputs[i] = solve(inputs[i]);
    }

    return combine(input, outputs);
  }

  protected abstract boolean isBaseCase(Input input);

  protected abstract Output conquer(Input input);

  protected abstract  Input[] divide(Input input);

  protected abstract Output combine(Input input, Output[] outputs);

}
