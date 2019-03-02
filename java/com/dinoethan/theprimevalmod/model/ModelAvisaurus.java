package com.dinoethan.theprimevalmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelAvisaurus extends ModelBase {
    public ModelRenderer field_192764_a;
    public ModelRenderer field_192766_c;
    public ModelRenderer field_192765_b;
    public ModelRenderer field_192768_e;
    public ModelRenderer field_192774_k;
    public ModelRenderer field_192767_d;
    public ModelRenderer field_192773_j;
    public ModelRenderer field_192768_eChild;
    public ModelRenderer field_192768_eChild_1;
    public ModelRenderer field_192768_eChild_2;

    public ModelAvisaurus() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.field_192768_eChild = new ModelRenderer(this, 10, 0);
        this.field_192768_eChild.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.field_192768_eChild.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 4, 0.0F);
        this.field_192765_b = new ModelRenderer(this, 22, 1);
        this.field_192765_b.setRotationPoint(0.0F, 21.06999969482422F, 1.159999966621399F);
        this.field_192765_b.addBox(-1.5F, -1.0F, -1.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(field_192765_b, 1.0149999856948853F, 0.0F, 0.0F);
        this.field_192773_j = new ModelRenderer(this, 14, 18);
        this.field_192773_j.setRotationPoint(1.0F, 22.0F, -1.0499999523162842F);
        this.field_192773_j.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(field_192773_j, 0.6682316660881042F, 0.0F, 0.0F);
        this.field_192767_d = new ModelRenderer(this, 19, 8);
        this.field_192767_d.setRotationPoint(-1.5F, 16.940000534057617F, -2.759999990463257F);
        this.field_192767_d.addBox(-0.5F, 0.0F, -1.5F, 1, 5, 3, 0.0F);
        this.setRotateAngle(field_192767_d, -0.6980999708175659F, -3.1415927410125732F, 0.08730000257492065F);
        this.field_192766_c = new ModelRenderer(this, 19, 8);
        this.field_192766_c.setRotationPoint(1.5F, 16.940000534057617F, -2.759999990463257F);
        this.field_192766_c.addBox(-0.5F, 0.0F, -1.5F, 1, 5, 3, 0.0F);
        this.setRotateAngle(field_192766_c, -0.6980999708175659F, -3.1415927410125732F, -0.08730000257492065F);
        this.field_192774_k = new ModelRenderer(this, 14, 18);
        this.field_192774_k.setRotationPoint(-1.0F, 22.0F, -1.0499999523162842F);
        this.field_192774_k.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(field_192774_k, 0.6682316660881042F, 0.0F, 0.0F);
        this.field_192768_e = new ModelRenderer(this, 2, 2);
        this.field_192768_e.setRotationPoint(0.0F, 15.6899995803833F, -2.759999990463257F);
        this.field_192768_e.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);
        this.field_192768_eChild_1 = new ModelRenderer(this, 11, 7);
        this.field_192768_eChild_1.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.field_192768_eChild_1.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F);
        this.field_192764_a = new ModelRenderer(this, 2, 8);
        this.field_192764_a.setRotationPoint(0.0F, 16.5F, -3.0F);
        this.field_192764_a.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(field_192764_a, 0.493699997663498F, 0.0F, 0.0F);
        this.field_192768_eChild_2 = new ModelRenderer(this, 16, 7);
        this.field_192768_eChild_2.setRotationPoint(0.0F, -1.75F, -2.450000047683716F);
        this.field_192768_eChild_2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.field_192768_e.addChild(this.field_192768_eChild);
        this.field_192768_e.addChild(this.field_192768_eChild_1);
        this.field_192768_e.addChild(this.field_192768_eChild_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_192765_b.render(f5);
        this.field_192773_j.render(f5);
        this.field_192767_d.render(f5);
        this.field_192766_c.render(f5);
        this.field_192774_k.render(f5);
        this.field_192768_e.render(f5);
        this.field_192764_a.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
