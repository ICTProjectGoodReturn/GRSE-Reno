package org.goodreturn.story;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.goodreturn.model.Story;

import com.liferay.portlet.asset.model.BaseAssetRenderer;

public class StoryAssetRenderer extends BaseAssetRenderer {
	
	private Story story;
	
	public StoryAssetRenderer(Story story) {
		this.story = story;
	}

	@Override
	public long getClassPK() {
		return story.getPrimaryKey();
	}

	@Override
	public long getGroupId() {
		return story.getGroup_Id();
	}

	@Override
	public String getSummary(Locale locale) {
		return "Story for loan " + story.getAbacus_Borrower_Loan_Id();
	}

	@Override
	public String getTitle(Locale locale) {
		return "Story for loan " + story.getAbacus_Borrower_Loan_Id();
	}

	@Override
	public long getUserId() {
		return story.getUser_Id();
	}

	@Override
	public String getUserName() {
		return "blah user";
	}

	@Override
	public String getUuid() {
		return story.getUuid();
	}

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse, String template) throws Exception {
		if (template.equals(TEMPLATE_FULL_CONTENT)) {
	        renderRequest.setAttribute("storyObject", story);
	        return "/html/story/" + template + ".jsp";
		} else {
			return null;
		}
	}
}
