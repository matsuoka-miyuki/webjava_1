package jp.co.systena.tigerscave.shopping.application.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.systena.tigerscave.shopping.application.model.ListService;

@Controller // Viewあり。Viewを返却するアノテーション
public class ShoppingController {

	@RequestMapping("/Shopping") // URLとのマッピング
	public String index(HttpSession session, Model model) {

		// Viewに渡すデータを設定
		ArrayList<HashMap<String,Object>> itemlist = ListService.getItemList();


		model.addAttribute("name", name);

		// Viewのテンプレート名を返す
		return "ListView";
	}

}
