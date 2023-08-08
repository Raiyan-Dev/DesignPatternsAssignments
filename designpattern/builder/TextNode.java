package net.media.training.designpattern.builder;

public class TextNode implements XMLNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public void addAttribute(String name, String value) {
        // Text nodes don't have attributes
    }

    public XMLNode addChild(XMLNode child) {
        // Text nodes can't have children
        return child;
    }

    public String toString() {
        return text;
    }
}
