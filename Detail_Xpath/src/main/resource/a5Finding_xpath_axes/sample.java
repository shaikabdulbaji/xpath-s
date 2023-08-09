package a5Finding_xpath_axes;

public class sample {
	
	/*
	 * 
	 * XPath AXES: (Demonstrate at http://omayo.blogspot.in/ )
	 
	 * Purpose:
			* If you want to locate an element which doesn't have id/name/class etc., with the help 
			  of XPath Axes we can locate such elements not having id/name/class with the help of 
			  id/name/class attributes of ancestor/descendant tags.
			  
	 * following :
			Purpose: Selects everything in the document after the closing tag of the current node
			
			Find all the 'body' tags after the 'head' tag - //head/following::body
			Find all the 'div' tags after //body/div[1]/div - //body/div[1]/div/following::div
			Find the first 'div' after //body/div[1]/div - //body/div[1]/div/following::div[1]
			Find all the 'input' tags after //body/div[1] - //body/div[1]/following::input
			
			
	 * preceding :
			Purpose: Selects all nodes that appear before the current node in the document, except ancestors nodes
			
			Find all the 'head' tags before the 'body' tag - //body/preceding::head
			Find all the 'div' tags before //body/div[4] - //body/div[4]/preceding::div
			
			
	 * following-sibling :
			Purpose:  Selects all siblings after the current node
			
			Find all the 'div' tag siblings after //body/div[1] - //body/div[1]/following-sibling::div
			Find all the 'p' tag siblings after //body/p[1] - //body/p[1]/following-sibling::p 
			(Demonstrate at http://compendiumdev.co.uk/selenium/basic_web_page.html )
			
				
	 * preceding-sibling :
			Purpose: Selects all siblings before the current node
			
			Find all the 'div' tag siblings before //body/div[4] - //body/div[4]/preceding-sibling::div
			Find all the 'p' tag siblings before //body/p[2] - //body/p[2]/preceding-sibling::p 
		    (Demonstrate at http://compendiumdev.co.uk/selenium/basic_web_page.html )
		    
		    
	 * parent :
			Purpose: Selects the parent of the current node
			
			Find the parent of 'head' tag - //head/parent::html
			Find the parent of 'body' tag - //body/parent::html
			Find the parent of 'title' tag - //title/parent::head
			Find the parent of first 'div' tag inside 'body' tag i.e. //div[1] - //div[1]/parent::body
			
			
	 * child :
			Purpose: Selects all children of the current node
			
			Find one of the child tag say 'head' of 'html' tag - //html/child::head
			Find one of the child tag say 'body' of 'html' tag - //html/child::body
			Find one of the child tag say 'title' of 'head' tag - //head/child::title
			Find one of the child tag say  first 'div' tag of 'body' tag - //body/child::div[1]
			
			
	 * ancestor :
			Purpose: Selects all ancestors (parent, grandparent, etc.) of the current node
			
			Find the ancestor 'html' tag for 'title' tag - //title/ancestor::html
			Find the ancestor 'html' tag for 'head' tag - //head/ancestor::html
			Find the ancestor 'html' tag for 'body' tag - //body/ancestor::html
			
			
	 * descendant :
			Purpose: Selects all descendants (children, grandchildren, etc.) of the current node
			
			Find the descendant 'title' tag for 'html' tag - //html/descendant::title
			Find the descendant 'head' tag for 'html' tag - //html/descendant::head
			Find the descendant 'body' tag for 'html' tag - //html/descendant::body
			
			
	 * 
	 */
	
	

}
