package io.nexusai.demo;
import java.util.*;
import org.springframework.stereotype.Service;
@Service public class DemoService {
 public List<String> execute(String input,String query){
  if(input==null||query==null||input.length()>50000||query.length()>2000)throw new IllegalArgumentException("Invalid input size");
  var totals=new TreeMap<String,java.math.BigDecimal>();for(String line:input.split("\\R")){var cells=line.split(",",-1);if(cells.length!=2)throw new IllegalArgumentException("Expected category,amount");totals.merge(cells[0].trim(),new java.math.BigDecimal(cells[1].trim()),java.math.BigDecimal::add);}return totals.entrySet().stream().map(e->e.getKey()+": "+e.getValue()).toList();
 }
}
