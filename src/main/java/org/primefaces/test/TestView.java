package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {

    private String testString;

    private List<String> list = new ArrayList<>();

    public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@PostConstruct
    public void init() {
        testString = "Welcome to PrimeFaces!!!";
        for (int i = 0; i < 50; i++) {
			list.add("a" + 1);
		}
    }

	public void add() {
        for (int i = 0; i < 50; i++) {
			list.add("a" + 1);
		}

	}

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
}
