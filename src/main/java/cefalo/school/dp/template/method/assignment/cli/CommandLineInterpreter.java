package cefalo.school.dp.template.method.assignment.cli;

import cefalo.school.dp.template.method.assignment.exception.CliException;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by satyajit on 9/22/2016.
 */
public class CommandLineInterpreter {
  private String cliInput;
  private String command;
  private String option;
  private String data;

  public CommandLineInterpreter(String cliInput) throws CliException {
    this.cliInput = cliInput;
    parseCommand();
  }

  private void parseCommand() throws CliException {
    if (StringUtils.isBlank(this.cliInput)) {
      throw new CliException("Command can't be blank!");
    }

    if (!StringUtils.startsWith(this.cliInput, "sort")) {
      throw new CliException("Only <sort> command can be processed!");
    }

    String[] inputParts = this.cliInput.split("\\s+");
    if (inputParts.length < 3) {
      throw new CliException("Bad sort input with invalid option/data!");
    }

    this.command = inputParts[0];
    this.option = inputParts[1];
    this.data = inputParts[2];
  }

  public String getCliInput() {
    return cliInput;
  }

  public void setCliInput(String cliInput) {
    this.cliInput = cliInput;
  }

  public String extractCommand() {
    return this.command;
  }

  public String extractOption() {
    return this.option;
  }

  public Object[] extractData() {
    Object[] dataParts = this.data.split(",");
    return dataParts;
  }
}
