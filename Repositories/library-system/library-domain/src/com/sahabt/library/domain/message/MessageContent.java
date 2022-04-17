package com.sahabt.library.domain.message;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class MessageContent {
	private String messageContent;

	public static MessageContent of (String messageContent) {
		return new MessageContent(messageContent);
	}
	private MessageContent(String messageContent) {
		super();
		this.messageContent = messageContent;
	}

	public String getMessageContent() {
		return messageContent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(messageContent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessageContent other = (MessageContent) obj;
		return Objects.equals(messageContent, other.messageContent);
	}

	@Override
	public String toString() {
		return "MessageContent [messageContent=" + messageContent + "]";
	}
	
	
	
	
}
