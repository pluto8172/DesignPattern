package com.wl.pluto.builder;

public class DialogBuilder {

    private String title;
    private String content;

    private DialogBuilder(Builder builder) {
        title = builder.title;
        content = builder.content;
    }


    public static final class Builder {
        private String title;
        private String content;

        public Builder() {
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder content(String val) {
            content = val;
            return this;
        }

        public DialogBuilder build() {
            return new DialogBuilder(this);
        }
    }
}
