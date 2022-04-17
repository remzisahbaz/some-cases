package com.sahabt.library.domain.message;

import com.sahabt.library.domain.annotations.Aggregate;

@Aggregate(id = "identityNo")
public class Message {

	private IdentityNo identityNo;
	private Email email;
	private MessageContent messageContent;

	public Message(Builder builder) {
		this.identityNo = builder.identityNo;
		this.email = builder.email;
		this.messageContent = builder.messageContent;
	}

	public IdentityNo getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(IdentityNo identityNo) {
		this.identityNo = identityNo;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public MessageContent getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(MessageContent messageContent) {
		this.messageContent = messageContent;
	}

	public static class Builder {
		private IdentityNo identityNo;
		private Email email;
		private MessageContent messageContent;

		public Builder identityNo(String identityNo) {
			this.identityNo = IdentityNo.of(identityNo);
			return this; 
		}

		public Builder email(String email, EmailType emailType) {
			this.email = Email.of(email,emailType);
			return this;
		}

		public Builder messageContent(String messageContent) {
			this.messageContent = MessageContent.of(messageContent);
			return this;
		}

		public Message build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new Message(this);
		}
	}
}
