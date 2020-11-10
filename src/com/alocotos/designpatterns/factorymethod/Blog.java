package com.alocotos.designpatterns.factorymethod;

public class Blog extends Website {

	//You can see different in types of Pages used to create different types of Websites.
	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
