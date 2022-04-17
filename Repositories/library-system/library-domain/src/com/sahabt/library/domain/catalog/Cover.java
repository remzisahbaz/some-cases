package com.sahabt.library.domain.catalog;

import java.util.Base64;
import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class Cover {
	private byte[] cover;

	public static Cover of(String base64Value) {
		return new Cover(Base64.getDecoder().decode(base64Value));
	}

	public static Cover of(byte[] cover) {
		return new Cover(cover);
	}

	private Cover(byte[] cover) {
		this.cover = cover;
	}
	
	public byte[] getCover() {
		return cover;
	}
	
}
