namespace MJ_Test
{
    partial class TextMover_SB
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(TextMover_SB));
            this.strt_btn = new System.Windows.Forms.Button();
            this.pic_lbl = new System.Windows.Forms.Label();
            this.tmr_sb = new System.Windows.Forms.Timer(this.components);
            this.SuspendLayout();
            // 
            // strt_btn
            // 
            this.strt_btn.Font = new System.Drawing.Font("Miramonte", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.strt_btn.Location = new System.Drawing.Point(595, 12);
            this.strt_btn.Name = "strt_btn";
            this.strt_btn.Size = new System.Drawing.Size(120, 48);
            this.strt_btn.TabIndex = 0;
            this.strt_btn.Text = "START";
            this.strt_btn.UseVisualStyleBackColor = true;
            this.strt_btn.Click += new System.EventHandler(this.strt_btn_Click);
            // 
            // pic_lbl
            // 
            this.pic_lbl.Font = new System.Drawing.Font("Miramonte", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.pic_lbl.ForeColor = System.Drawing.Color.Chartreuse;
            this.pic_lbl.Image = ((System.Drawing.Image)(resources.GetObject("pic_lbl.Image")));
            this.pic_lbl.Location = new System.Drawing.Point(43, 76);
            this.pic_lbl.Name = "pic_lbl";
            this.pic_lbl.Size = new System.Drawing.Size(1274, 617);
            this.pic_lbl.TabIndex = 1;
            // 
            // tmr_sb
            // 
            this.tmr_sb.Interval = 300;
            this.tmr_sb.Tick += new System.EventHandler(this.tmr_sb_Tick);
            // 
            // TextMover_SB
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1361, 730);
            this.Controls.Add(this.pic_lbl);
            this.Controls.Add(this.strt_btn);
            this.Name = "TextMover_SB";
            this.Text = "TextMover_SB";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button strt_btn;
        private System.Windows.Forms.Label pic_lbl;
        private System.Windows.Forms.Timer tmr_sb;
    }
}