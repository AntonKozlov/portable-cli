package com.example.portablecli;

import org.crac.CheckpointException;
import org.crac.RestoreException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@SpringBootApplication
@ShellComponent
public class PortableCliApplication {
	public static void main(String[] args) {
		SpringApplication.run(PortableCliApplication.class, args);
	}

    @ShellMethod(key = "checkpoint")
    public void checkpoint() throws RestoreException, CheckpointException {
        org.crac.Core.checkpointRestore();
    }
}
