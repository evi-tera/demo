package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.recursive.demo.MessageParameter;
import com.recursive.demo.MessageParts;
import com.recursive.demo.MessageSection;

@Controller
public class RecursiveController {

	@RequestMapping("/recursive")
	public String recursive(Model model) {

		MessageParts mainMsgSection = new MessageSection("mainSection", "Main Section");

		MessageParts msgParam1 = new MessageParameter("param1", "Param 1");
		((MessageSection) mainMsgSection).add(msgParam1);

		MessageParts msgSection1 = new MessageSection("section1", "Section 1");
		((MessageSection) msgSection1).add(new MessageParameter("param1_1", "Param 1.1"));
		((MessageSection) msgSection1).add(new MessageParameter("param1_2", "Param 1.2"));
		
		MessageParts msgSection2 = new MessageSection("section2", "Section 2");
		((MessageSection) msgSection2).add(new MessageParameter("param2_1", "Param 2.1"));
		((MessageSection) msgSection2).add(new MessageParameter("param2_2", "Param 2.2"));
		((MessageSection) msgSection1).add(msgSection2);
		
		MessageParts msgSection3 = new MessageSection("section3", "Section 3");
		((MessageSection) msgSection3).add(new MessageParameter("param3_1", "Param 3.1"));
		((MessageSection) msgSection3).add(new MessageParameter("param3_2", "Param 3.2"));
		((MessageSection) msgSection1).add(msgSection3);
		
		
		((MessageSection) mainMsgSection).add(msgSection1);

		
		MessageParts msgParam2 = new MessageParameter("param2", "Param 2");
		((MessageSection) mainMsgSection).add(msgParam2);
		
		MessageParts msgSection4 = new MessageSection("section4", "Section 4");
		((MessageSection) msgSection4).add(new MessageParameter("param4_1", "Param 4.1"));
		((MessageSection) msgSection4).add(new MessageParameter("param4_2", "Param 4.2"));
		
		MessageParts msgSection5 = new MessageSection("section5", "Section 5");
		((MessageSection) msgSection5).add(new MessageParameter("param5_1", "Param 5.1"));
		((MessageSection) msgSection5).add(new MessageParameter("param5_2", "Param 5.2"));
		((MessageSection) msgSection4).add(msgSection5);
		((MessageSection) mainMsgSection).add(msgSection4);

		
		model.addAttribute("msgParts", mainMsgSection);

		return "recursive";
	}

}
