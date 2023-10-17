package fr.paris.lutece.plugins.mydashboard.modules.identity.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import fr.paris.lutece.plugins.mydashboard.service.MyDashboardComponent;
import fr.paris.lutece.portal.service.template.AppTemplateService;
import fr.paris.lutece.portal.web.l10n.LocaleService;
import fr.paris.lutece.util.html.HtmlTemplate;

public abstract class AbstractMyDashboardIdentity extends MyDashboardComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String _strTemplate;
	
	public String getData( HttpServletRequest request )
	{
		Map<String, Object> model = new HashMap<>( );
		HtmlTemplate template = AppTemplateService.getTemplate( _strTemplate, LocaleService.getDefault( ), model );

        return template.getHtml( );
	}
}
