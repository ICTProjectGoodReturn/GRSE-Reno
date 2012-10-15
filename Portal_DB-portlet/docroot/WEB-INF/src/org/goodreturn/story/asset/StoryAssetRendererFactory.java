package org.goodreturn.story.asset;

import org.goodreturn.model.Story;
import org.goodreturn.service.StoryLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

public class StoryAssetRendererFactory extends BaseAssetRendererFactory {
	
	public static final String CLASS_NAME = Story.class.getName();
	public static final String TYPE = "story";
	
	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type) throws PortalException, SystemException {
		    Story story = StoryLocalServiceUtil.getStory(classPK);
		    return new StoryAssetRenderer(story);
		}

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType() {
		return TYPE;
	}
}
