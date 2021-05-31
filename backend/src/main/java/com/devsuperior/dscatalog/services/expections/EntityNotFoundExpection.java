package com.devsuperior.dscatalog.services.expections;

public class EntityNotFoundExpection extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EntityNotFoundExpection(String msg) {
		super(msg);
	}
}
