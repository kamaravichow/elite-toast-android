package me.aravi.elite;


public class Elite {
    String title;
    String style;
    long duration;

    private Elite(String title, String style, long duration) {
        this.title = title;
        this.style = style;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }


    public String getStyle() {
        return style;
    }

    public long getDuration() {
        return duration;
    }


    interface title {
        style setTitle(String title);
    }

    interface style {
        duration setStyle(String style);
    }

    interface duration {
        create setDuration(long duration);
    }

    interface create {
        // Optional items here
        Elite build();
    }


    public static class builder implements title, style, duration, create {
        String title;
        String style;
        long duration;

        private builder() {

        }

        public static title make() {
            return new builder();
        }

        @Override
        public style setTitle(String title) {
            this.title = title;
            return this;
        }

        @Override
        public duration setStyle(String style) {
            this.style = style;
            return this;
        }

        @Override
        public create setDuration(long duration) {
            this.duration = duration;
            return this;
        }

        @Override
        public Elite build() {
            return new Elite(title, style, duration);
        }
    }
}
