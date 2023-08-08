package net.media.training.designpattern.builder;

public class XMLBuilder {
    private XMLNode root;

    public XMLBuilder(String rootName) {
        root = new ElementNode(rootName);
    }

    public void addPerson(Person person) {
        ElementNode personNode = new ElementNode("Person");
        personNode.addAttribute("id", String.valueOf(person.getId()));
        personNode.addAttribute("name", person.getName());

        ElementNode addressNode = new ElementNode("Address");
        addressNode.addChild(new ElementNode("City")).addChild(new TextNode(person.getCity()));
        addressNode.addChild(new ElementNode("Country")).addChild(new TextNode(person.getCountry()));

        personNode.addChild(addressNode);
        root.addChild(personNode);
    }

    public String build() {
        return root.toString();
    }
}
