package net.media.training.designpattern.builder;

public interface XMLNode {
    void addAttribute(String name, String value);
    XMLNode addChild(XMLNode child);
    String toString();
}