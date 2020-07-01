//package com.ryder.online.FileOperation;
//
//
//import org.apache.xml.security.c14n.CanonicalizationException;
//import org.apache.xml.security.c14n.Canonicalizer;
//import org.apache.xml.security.c14n.InvalidCanonicalizerException;
//import org.w3c.dom.Element;
//import org.w3c.dom.bootstrap.DOMImplementationRegistry;
//import org.w3c.dom.ls.DOMImplementationLS;
//import org.w3c.dom.ls.LSSerializer;
//import org.xml.sax.InputSource;
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.transform.TransformerException;
//import java.io.IOException;
//import java.io.StringReader;
//
//import static org.apache.xml.security.Init.init;
//import static org.junit.Assert.assertEquals;
//
//public class XMLComparision {
//        static {
//            init();
//        }
//
//        public static String toCanonicalXml(String xml) throws InvalidCanonicalizerException, ParserConfigurationException, SAXException, CanonicalizationException, IOException {
//            Canonicalizer canon = Canonicalizer.getInstance(Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS);
//            byte canonXmlBytes[] = canon.canonicalize(xml.getBytes());
//            return new String(canonXmlBytes);
//        }
//
//        public static String prettyFormat(String input) throws TransformerException, ParserConfigurationException, IOException, SAXException, InstantiationException, IllegalAccessException, ClassNotFoundException {
//            InputSource src = new InputSource(new StringReader(input));
//            Element document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src).getDocumentElement();
//            Boolean keepDeclaration = input.startsWith("<?xml");
//            DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
//            DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
//            LSSerializer writer = impl.createLSSerializer();
//            writer.getDomConfig().setParameter("format-pretty-print", Boolean.TRUE);
//            writer.getDomConfig().setParameter("xml-declaration", keepDeclaration);
//            return writer.writeToString(document);
//        }
//
//        public static void assertXMLEqual(String expected, String actual) throws ParserConfigurationException, IOException, SAXException, CanonicalizationException, InvalidCanonicalizerException, TransformerException, IllegalAccessException, ClassNotFoundException, InstantiationException {
//            String canonicalExpected = prettyFormat(toCanonicalXml(expected));
//            String canonicalActual = prettyFormat(toCanonicalXml(actual));
//            assertEquals(canonicalExpected, canonicalActual);
//        }
//    }
//}
