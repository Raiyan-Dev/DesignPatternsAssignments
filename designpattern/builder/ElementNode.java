package net.media.training.designpattern.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementNode implements XMLNode {
    private String name;
    private Map<String, String> attributes = new HashMap<>();
    private List<XMLNode> children = new ArrayList<>();

    public ElementNode(String name) {
        this.name = name;
    }

    public void addAttribute(String name, String value) {
        attributes.put(name, value);
    }

    public XMLNode addChild(XMLNode child) {
        children.add(child);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(name);
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            sb.append(" ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }
        sb.append(">");
        for (XMLNode child : children) {
            sb.append(child.toString());
        }
        sb.append("</").append(name).append(">");
        return sb.toString();
    }
}
