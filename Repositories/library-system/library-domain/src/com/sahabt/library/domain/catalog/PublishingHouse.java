package com.sahabt.library.domain.catalog;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class PublishingHouse {
	private String publishingHouseName;

	public static PublishingHouse of(String publishingHouseName) {
		return new PublishingHouse(publishingHouseName);
	}
	private PublishingHouse(String publishingHouseName) {
		super();
		this.publishingHouseName = publishingHouseName;
	}

	public String getPublishingHouseName() {
		return publishingHouseName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(publishingHouseName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PublishingHouse other = (PublishingHouse) obj;
		return Objects.equals(publishingHouseName, other.publishingHouseName);
	}

	@Override
	public String toString() {
		return "PublishingHouse [publishingHouseName=" + publishingHouseName + "]";
	}
	
	
}
