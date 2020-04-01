package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.CheckboxTreeNode;

@Named
@ViewScoped
public class TestView implements Serializable {

	private CheckboxTreeNode rootTreeNode;
	private int getterCount = 0;

	public int getGetterCount() {
		return getterCount;
	}



	public void setGetterCount(int getterCount) {
		this.getterCount = getterCount;
	}



	@PostConstruct
    public void init() {
		rootTreeNode = new CheckboxTreeNode("root");
		for (int i = 0; i < 50; i++) {
			new CheckboxTreeNode("node", i, rootTreeNode);
		}
	}



	public CheckboxTreeNode getRootTreeNode() {
		getterCount ++;
		return rootTreeNode;
	}
}
